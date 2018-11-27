/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edward.main;

import com.edward.bcp.controller;

/**
 *
 * @author ext_ealinares
 */
public class demousbureauoflaborstatistics {

    public static void main(String[] args) throws Exception {

        int falg4;

        controller control = new controller();

        if (control.main() > 0) {
            System.out.println("NOK");
        }
        else {

            System.out.println("OK");
        }

        //  falg4 = CUUR0000SA0P.main();
    }

}
