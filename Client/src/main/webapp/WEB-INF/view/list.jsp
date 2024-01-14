<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <table id="table">
           <a href="View/add.jsp">Them</a>
           <thead>
           <tr>
           <th>MaHocSinh</th>
           <th>TenHocSinh</th>
           <th>Tuoi</th>
           </tr>
           </thead><tbody></tbody>
       </table>
       	<script type="text/javascript">
		let a = ${rs};
		
		for (let i = 0; i < a.length; i++) {
			let tr = document.createElement("tr");
			
			let tr1 = document.createElement("td");
			tr1.innerHTML = a[i].maHS;
			tr.appendChild(tr1);
			
			let tr2 = document.createElement("td");
			tr2.innerHTML = a[i].tenHS;
			tr.appendChild(tr2);
			
			let tr3 = document.createElement("td");
			tr3.innerHTML = a[i].tuoi;
			tr.appendChild(tr3);
			
			 
			let a1 = document.createElement("a");
			a1.setAttribute("href", "deleteHocSinh?id=" + a[i].maHS);
			a1.innerHTML = "Xoa";
			let tr6 = document.createElement("td");
			tr6.appendChild( a1 );
			tr.appendChild(tr6);
			
			/*
			let a2 = document.createElement("a");
			a2.setAttribute("href", "View/update.jsp?id=" + a[i].maGiangVien);
			a2.innerHTML = "Cap nhat";
			let tr7 = document.createElement("td");
			tr7.appendChild( a2 );
			tr.appendChild(tr7); */
			
			document.querySelector("#table tbody").appendChild(tr);
		}
	</script>
</body>
</html>