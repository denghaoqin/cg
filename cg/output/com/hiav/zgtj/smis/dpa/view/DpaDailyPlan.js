/** @Controller */

/** @View */
var dsMain = view.get("#dsMain");

// @Bind #btnAddMain.onClick
!function(self, arg) {
	dsMain.getData().insert();
	view.get("#dlgMain").show();
};

// @Bind #btnEditMain.onClick
// @Bind #dgMain.onDataRowDoubleClick
!function(self, arg) {
	var e = dsMain.getData("#");
	if(e) {
		view.get("#dlgMain").show();
	}
};

// @Bind #btnDeleteMain.onClick
!function(self, arg) {
	var e = dsMain.getData("#");
	if (e) {
		dorado.MessageBox.confirm("�������ɾ��ǰ�����?", function() {
			e.set("deleted", 1);
			view.get("#actSaveMain").execute(function(msg) {
				if(msg) {
					e.cancel();
					// dsMain.flushAsync();
					dorado.MessageBox.alert(msg);
				} else {
					dsMain.flushAsync();
					dorado.widget.NotifyTipManager.notify("ɾ��ɹ���");
				}
			});
		});
	}
};

// @Bind #btnSaveMain.onClick
!function(self, arg) {
	var act = view.get("#actSaveMain");

	if (act.get("hasUpdateData")) {
			act.execute(function(msg) {
				if(msg) {
					dorado.MessageBox.alert(msg);
				} else {
					view.id("dlgMain").hide();
					dorado.widget.NotifyTipManager.notify("����ɹ���");
				}
			});
	} else {
		dorado.MessageBox.alert("û����Ҫ��������");
		view.id("dlgMain").hide();
	}
};

// @Bind #btnCancelMain.onClick
!function(self, arg) {
	if (view.get("#actSaveMain").get("hasUpdateData")) {
		dorado.MessageBox.confirm("�����Ҫȡ��ǰ������", function() {
			view.id("dlgMain").hide();
			dsMain.getData("#").cancel();
		});
	} else {
		view.id("dlgMain").hide();
	}
};