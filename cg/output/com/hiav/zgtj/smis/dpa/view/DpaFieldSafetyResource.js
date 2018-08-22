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
		dorado.MessageBox.confirm("您真的想删除当前数据吗?", function() {
			e.set("deleted", 1);
			view.get("#actSaveMain").execute(function(msg) {
				if(msg) {
					e.cancel();
					// dsMain.flushAsync();
					dorado.MessageBox.alert(msg);
				} else {
					dsMain.flushAsync();
					dorado.widget.NotifyTipManager.notify("删除成功！");
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
					dorado.widget.NotifyTipManager.notify("保存成功！");
				}
			});
	} else {
		dorado.MessageBox.alert("没有需要保存的数据");
	}
};

// @Bind #btnCancelMain.onClick
!function(self, arg) {
	if (view.get("#actSaveMain").get("hasUpdateData")) {
		dorado.MessageBox.confirm("您真的要取消当前操作吗？", function() {
			view.id("dlgMain").hide();
			dsMain.getData("#").cancel();
		});
	} else {
		view.id("dlgMain").hide();
	}
};

//@Bind #dlgMain.onClose
!function(self, arg) {
	if (view.get("#actSaveMain").get("hasUpdateData")) {
		dsMain.getData("#").cancel();
	} 
};