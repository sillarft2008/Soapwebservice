/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.fileStatistic;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author Flor
 */
@WebService(serviceName = "Server")
public class Server {
    int count;

    
    @WebMethod(operationName = "getLetterCount")
    public int getLetterCount(@WebParam(name = "text") String text) {
        count = 0;
        char[] characters = text.toCharArray();
        for (char character : characters){
            if(Character.isLetter(character)){
              count++;
            }      
        }
         return count;
    }
    
    @WebMethod(operationName = "getWordCount")
    public int getWordCount(@WebParam(name = "text") String text){
        count = 0;
        String[] lines = text.split("\\n");
        for (String line : lines){      //using java for each loop to print elements of string a
            String[] words = line.split("\\s"); // Split the string based on white space
            count = words.length;
        }
        return count;
    }
    
    @WebMethod(operationName = "getLineCount")
    public int getLineCount(@WebParam(name = "text") String text){
        count = 0;
        String[] lines = text.split("\\n");
        count = lines.length;
        return count;       
    }
}

