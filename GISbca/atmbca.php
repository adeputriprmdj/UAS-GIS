<<?php 
$username = "iid13248200_root22";
$servername = "localhost";
$dbname = "id13234396_atmbca";
$password = "atm_BCA.s4j4";

//buat koneksi
$conn = new mysqli($servername, $username, $password, $dbname);

//kondisi cek koneksi
if($conn->connect_error) {
	die("connection failed". $conn->connect_error);
}
$sql = "SELECT * FROM bca";

$result = $conn->query($sql);
$data = array();

if ($result->num_rows>0)

{
	while ($row=$result->fetch_assoc()) {
		$data[]= $row;
	}
}else {
	echo "0 result";
}
echo json_encode($data);
$conn->close();




 ?>

