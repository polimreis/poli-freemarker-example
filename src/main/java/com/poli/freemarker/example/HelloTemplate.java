/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poli.freemarker.example;

import freemarker.template.TemplateException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author poliana
 */
public class HelloTemplate {

    public static void main(String[] args) throws IOException, TemplateException {

        Map map = new HashMap();
        map.put("data", new Date());
        map.put("usuario", "Ricardo");

        List produtos = new ArrayList();
        produtos.add(new Produto("Produto A1", 300.14));
        produtos.add(new Produto("Produto B2", 401.56));
        produtos.add(new Produto("Produto C3", 555.77));

        map.put("produtos", produtos);

        String s = FreemarkerUtils.parseTemplate(map, "/teste.ftl");

        System.out.println(s);
    }

}
