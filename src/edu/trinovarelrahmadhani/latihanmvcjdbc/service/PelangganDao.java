/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.trinovarelrahmadhani.latihanmvcjdbc.service;

import edu.trinovarelrahmadhani.latihanmvcjdbc.entity.Pelanggan;
import edu.trinovarelrahmadhani.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author 
 *  Nama  : Tri Novarel Rahmadhani
    NIM   : 10119069
    Kelas : IF-2
    Latihan MVC JDBC
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException; 
    public void updatePelanggan(Pelanggan pelanggan) throws  PelangganException;
    public void deletePelanggan(Integer id) throws  PelangganException;
    public Pelanggan getPelanggan(Integer id) throws  PelangganException;
    //unique
    public Pelanggan getPelanggan(String email) throws  PelangganException;
    //Jika ingin meload semua data pelanggan
    public List<Pelanggan> selectAllPelanggan() throws  PelangganException;
}
