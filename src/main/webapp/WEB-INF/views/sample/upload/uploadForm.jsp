<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.fileDrop {
	width: 100%;
	height: 200px;
	border: 1px dotted blue;
}

small {
	margin-left: 3px;
	font-weight: bold;
	color: gray;
}
</style>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

<title>Test Pdf upload</title>
</head>
<body>

<div layout:fragment="content">
	<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        파일 업로드 테스트1
        <small>Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 예제</a></li>
        <li class="active">read</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->
        
        <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">파일업로드 테스트 1</h3>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <!-- <form id="form1" action="/sample/upload/uploadForm" method="post" enctype="multipart/form-data"> -->
            <form id="form" action="/mycollection/sample/upload/uploadForm" method="post" enctype="multipart/form-data">
              <div class="box-body">
                <div class="form-group">
                  <!-- <label for="exampleInputBoardTitle">Title</label>
                  <input type="text"  class="form-control"> -->
                  <input type="file" name="file">?<input type="submit">1111
                </div>
              </div>
              <!-- /.box-body -->

              <div class="box-footer">
                <button type="submit" class="btn btn-warning">제1출</button>
                <!-- <button type="submit" class="btn btn-danger">Remove</button>

 

                <button type="submit" class="btn btn-primary">ListPage</button> -->
              </div>
            </form>
          </div>
          <!-- /.box -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
</div>


	<script type="text/javascript">
	$(function () {


	});

	
	</script>



</body>
</html>