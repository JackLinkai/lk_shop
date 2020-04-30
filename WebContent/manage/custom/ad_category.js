$(function() {

	// 初始化宽度、高度
	$(".widget-box").height($(window).height() - 215);
	$(".table_menu_list").width($(window).width() - 260);
	$(".table_menu_list").height($(window).height() - 215);
	// 当文档窗口发生改变时 触发
	$(window).resize(function() {
		$(".widget-box").height($(window).height() - 215);
		$(".table_menu_list").width($(window).width() - 260);
		$(".table_menu_list").height($(window).height() - 215);
	})

	/* Javascript代码片段 */
	var t = $('#sample-table')
			.DataTable(
					{
						ajax : {
							// 指定数据源
							url : "../ad/findAllAdCatDT.do"
						},
						// 每页显示10数据
						pageLength : 10,
						columns : [ {
							"data" : null
						}, {
							"data" : "id"
						}, {
							"data" : "name"
						}, {
							"data" : "num"
						}, {
							"data" : "desc"
						}, {
							"data" : "createTime"
						}, {
							"data" : "status"
						}, {
							"data" : "id"
						} ],
						"columnDefs" : [ // 每列定义

								{
									"orderable" : false,// 复选框不排序
									"targets" : 0,
									"render" : function(data, type, row, meta) {
										return '<td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>';
									}
								},
								{
									"orderable" : false,
									"targets" : [ 2, 4, 6, 7 ]

								},
								{
									"orderable" : false,// 状态不排序
									"targets" : 6,
									"render" : function(data, type, row, meta) {
										return "<td>"
												+ "<span class=\"label label-success radius td-status\">显示</span></td>";
									},

								},
								{
									"orderable" : false,// 操作不排序
									"targets" : 7,
									"render" : function(data, type, row, meta) {
										return "<td><a onClick=\"member_stop(this,"
												+ data
												+ ")\" href=\"javascript:;\" title=\"停用\" class=\"btn btn-xs btn-success td-manage\"><i class=\"fa fa-check bigger-120\"></i></a>"
												+ "<a title=\"编辑\" onclick=\"member_edit(\"编辑','member-add.html\","
												+ data
												+ ",'','510')\"href=\"javascript:;\" class=\"btn btn-xs btn-info\"><i class=\"fa fa-edit bigger-120\"></i></a>"
												+ "<a title=\"删除\" href=\"javascript:;\" onclick=\"member_del(this,"
												+ data
												+ ")\" class=\"btn btn-xs btn-warning\"><i class=\"fa fa-trash  bigger-120\"></i></a>"
												+ "<a href=\"javascript:ovid()\" name=\"Ads_list.html\" class=\"btn btn-xs btn-pink ads_link\" onclick=\"AdlistOrders('"
												+ data
												+ "');\" title=\"广告列表内容\"><i class=\"fa  fa-bars  bigger-120\"></i></a></td>";
									},
								},

						],
						"lengthMenu" : [ 10, 25, 50, 75, 100 ]
						// 指定每页数量
					});

	$('table td input:checkbox').on(
			'click',
			function() {
				var that = this;
				$(this).closest('table').find(
						'tr > td:first-child input:checkbox').each(function() {
					this.checked = that.checked;
					$(this).closest('tr').toggleClass('selected');
				});
			});

});