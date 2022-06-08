package com.ug14.rumahsakit;

import java.sql.*;

public class DAO {
    private String url="jdbc:sqlite:contoh.db";

    public void createDatabase(){
        try(Connection conn= DriverManager.getConnection(url)){
            DatabaseMetaData metaData=conn.getMetaData();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void createTableDokter(){
        String createTableDokter ="CREATE TABLE IF NOT EXISTS Dokter (idDokter int PRIMARY KEY, nama varchar(55) NOT NULL, spesialis varchar(55) NOT NULL, ruangan varchar(55) NOT NULL);";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(createTableDokter);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTableSuster(){
        String createTableSuster ="CREATE TABLE IF NOT EXISTS Suster (idSuster int PRIMARY KEY, nama varchar(55) NOT NULL);";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(createTableSuster);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTablePasien(){
        String createTablePasien ="CREATE TABLE IF NOT EXISTS Pasien (rm int PRIMARY KEY, nama varchar(55) NOT NULL, alamat varchar(55) NOT NULL, usia int NOT NULL, penyakit varchar(55) NOT NULL, levelPenyakit int, status varchar(55) NOT NULL);";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(createTablePasien);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTablePelayanan(){
        String createTablePelayan ="CREATE TABLE IF NOT EXISTS Pelayanan (idPelayanan int PRIMARY KEY, nama varchar(55) NOT NULL);";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(createTablePelayan);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTableJadwal(){
        String createTableJ ="CREATE TABLE IF NOT EXISTS Jadwal  (idPemeriksaan int PRIMARY KEY, idDokter int NOT NULL, idPelayanan int NOT NULL, idSuster int NOT NULL, status varchar(55) NOT NULL);";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(createTableJ);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Dokter getDokterByID(int id){
        String q="SELECT * from Dokter where idDokter="+id;
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public Suster getSusterByID(int id){
        String q="SELECT * from Suster where idSuster="+id;
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Pelayanan getPelayananByID(int id){
        String q="SELECT * from Pelayanan where idPelayanan="+ id;
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void inputPasien(Pasien p){
        String q="INSERT INTO Pasien VALUES('"+p.getRm()+"','"+p.getNama()+"','"+p.getAlamat()+"','"+p.getUsia()+"','"+p.getPenyakit()+"','"+p.getLevelPenyakit()+"','"+p.getStatus()+"')";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inputJadwal(Jadwal j){
        String q="INSERT INTO Jadwal VALUES('"+j.getIdPemeriksaan()+"','"+j.getDokter().getIdDokter()+"','"+j.getPelayanan().getIdPelayanan()+"','"+j.getSuster().getIdSuster()+"','"+j.getPasien().getStatus()+"')";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getPasienSembuh(){
        String url="jdbc:sqlite:database.db";
        String q="SELECT * from Pasien where Status='sembuh'";
        try(Connection conn= DriverManager.getConnection(url)){
            Statement statement =conn.createStatement();
            statement.execute(q);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DAO ex=new DAO();
        ex.createDatabase();
        ex.createTableDokter();
        ex.createTableJadwal();
        ex.createTablePasien();
        ex.createTableSuster();
        ex.createTablePelayanan();
    }
}
