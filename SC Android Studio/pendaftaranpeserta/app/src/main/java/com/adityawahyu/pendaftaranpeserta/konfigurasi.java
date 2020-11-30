package com.adityawahyu.pendaftaranpeserta;


public class konfigurasi {


    public static final String URL_ADD="http://10.60.102.93/Android/pegawai/tambahPgw.php";
    public static final String URL_GET_ALL = "http://10.60.102.93/Android/pegawai/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "http://10.60.102.93/Android/pegawai/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "http://10.60.102.93/Android/pegawai/updatePgw.php";
    public static final String URL_DELETE_EMP = "http://10.60.102.93/Android/pegawai/hapusPgw.php?id=";


    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg";
    public static final String KEY_EMP_GAJIH = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
