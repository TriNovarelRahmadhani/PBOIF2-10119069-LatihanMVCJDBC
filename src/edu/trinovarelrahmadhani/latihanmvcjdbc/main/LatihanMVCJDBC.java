/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.trinovarelrahmadhani.latihanmvcjdbc.main;

import edu.trinovarelrahmadhani.latihanmvcjdbc.database.BarbershopDatabase;
import edu.trinovarelrahmadhani.latihanmvcjdbc.entity.Pelanggan;
import edu.trinovarelrahmadhani.latihanmvcjdbc.error.PelangganException;
import edu.trinovarelrahmadhani.latihanmvcjdbc.service.PelangganDao;
import edu.trinovarelrahmadhani.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author 
 *  Nama  : Tri Novarel Rahmadhani
    NIM   : 10119069
    Kelas : IF-2
    Latihan MVC JDBC
 */
public class LatihanMVCJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
