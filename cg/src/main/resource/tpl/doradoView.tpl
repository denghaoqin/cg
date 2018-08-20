<?xml version="1.0" encoding="UTF-8"?>
<ViewConfig>
  <Arguments/>
  <Context/>
  <Model/>
  <View>
    <DataSet id="dsMain">
      <Property name="dataProvider">#(hump(table.tableName))UI#find</Property>
      <Property name="dataType">[#(capitalFirstChar(hump(table.tableName)))]</Property>
      <Property name="pageSize">10</Property>
    </DataSet>
    <UpdateAction id="actSaveMain">
      <Property name="dataResolver">#(hump(table.tableName))UI#saveMain</Property>
      <UpdateItem>
        <Property name="dataSet">dsMain</Property>
        <Property name="dataPath">!DIRTY_TREE</Property>
      </UpdateItem>
    </UpdateAction>
    <Container>
      <ToolBar>
        <DataPilot id="dpMain">
          <Property name="dataSet">dsMain</Property>
          <Property name="itemCodes">pages</Property>
        </DataPilot>
        <ToolBarButton id="btnAddMain">
          <Property name="caption">添加</Property>
          <Property name="icon">url(>skin>common/icons.gif) -120px -0px</Property>
          <Property name="hideMode">display</Property>
          <Property name="tags">z</Property>
        </ToolBarButton>
        <ToolBarButton id="btnDeleteMain">
          <Property name="caption">删除</Property>
          <Property name="icon">url(>skin>common/icons.gif) -40px -0px</Property>
          <Property name="hideMode">display</Property>
          <Property name="tags">z</Property>
        </ToolBarButton>
        <ToolBarButton id="btnEditMain">
          <Property name="caption">修改</Property>
          <Property name="icon">url(>skin>common/icons.gif) -200px -0px</Property>
        </ToolBarButton>
      </ToolBar>
      <DataGrid id="dgMain">
        <Property name="dataSet">dsMain</Property>
        <Property name="readOnly">true</Property>
        <Property name="showFilterBar">true</Property>
        <Property name="sortMode">serverSide</Property>
        <Property name="filterMode">serverSide</Property>
        <IndicatorColumn/>
      </DataGrid>
    </Container>
    <Dialog id="dlgMain">
      <Property name="center">true</Property>
      <Property name="width">500</Property>
      <Property name="height">280</Property>
      <Property name="modal">true</Property>
      <Property name="caption">详细信息</Property>
      <Buttons>
        <Button id="btnSaveMain">
          <Property name="caption">保存</Property>
          <Property name="icon">url(>skin>common/icons.gif) -140px -20px</Property>
        </Button>
        <Button id="btnCancelMain">
          <Property name="caption">取消</Property>
          <Property name="icon">url(>skin>common/icons.gif) -40px -0px</Property>
        </Button>
      </Buttons>
      <Children>
        <AutoForm id="afMain">
          <Property name="dataSet">dsMain</Property>
          <Property name="cols">*</Property>
          <Property name="labelWidth">80</Property>
          <Property name="labelSeparator">：</Property>
          <Property name="labelAlign">right</Property>
        </AutoForm>
      </Children>
      <Tools/>
    </Dialog>
  </View>
</ViewConfig>
