<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">MODIFY BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" action="modifyPage" method="post">

	<input type='hidden' name='page' value="${cri.page}"> <input
		type='hidden' name='perPageNum' value="${cri.perPageNum}">
	<input type='hidden' name='searchType' value="${cri.searchType}">
	<input type='hidden' name='keyword' value="${cri.keyword}">

					<div class="box-body">

						<div class="form-group">
							<label for="exampleInputEmail1">번호</label> <input type="text"
								name='bno' class="form-control" value="${boardVO.bno}"
								readonly="readonly">
						</div>

						<div class="form-group">
							<label for="exampleInputEmail1">제목</label> <input type="text"
								name='title' class="form-control" value="${boardVO.title}">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">글</label>
							<textarea class="form-control" name="content" rows="3">${boardVO.content}</textarea>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">글쓴이</label> <input
								type="text" name="writer" class="form-control"
								value="${boardVO.writer}">
						</div>
					</div>
					<!-- /.box-body -->
				</form>
				<div class="box-footer">
					<button type="submit" class="btn btn-primary">수정</button>
					<button type="submit" class="btn btn-warning">취소</button>
				</div>

<script>
$(document).ready(
	function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning")
				.on("click",function() {
					self.location = "/sboard/list?page=${cri.page}&perPageNum=${cri.perPageNum}"
							+ "&searchType=${cri.searchType}&keyword=${cri.keyword}";
				});

		$(".btn-primary").on("click",
				function() {
					formObj.submit();
				});
	});
</script>




			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
