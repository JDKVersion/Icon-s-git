var setting = {
    view: {
        showLine: true,
        showIcon: true
    },
    data: {
        simpleData: {
            enable: true
        }

    }
}

var zNode0=[
    { id:1, pId:0, name:"用品管理"},
    { id:2, pId:1, name:"用品信息"},
];



$(function () {
    $.fn.zTree.init($("#ztree"), setting, zNode0);
    $("#datum").click(function () {
        $.fn.zTree.init($("#ztree"), setting, zNode0);
    });

})
