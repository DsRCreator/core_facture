package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMichel implements InvoiceRepositoryInterface{


    public void create(Invoice invoice){
        /*[...]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE " +
                "(NUMBER, CUSTOMERNAME) VALUES (?,?)");
        [...]
        pstmt.executeUpdate(); */
    }
}
