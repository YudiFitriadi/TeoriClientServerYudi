/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yudi.Latihan_Teori;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
=public class DatabaseTest {

  @Test
  void testSingleton() {

    var database1 = Database.getInstance();
    var database2 = Database.getInstance();

    Assertions.assertSame(database1, database2);

  }
}

