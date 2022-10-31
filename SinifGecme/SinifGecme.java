package SinifGecme;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class SinifGecme {

   
    public static void main(String[] args) {
    
        Scanner tar=new Scanner(System.in);

        double mat,fiz,kim,biy,tur;

        System.out.println("Matematik Notu Giriniz:");
        mat=tar.nextDouble();
        System.out.println("Türkçe Notu Giriniz:");
        tur=tar.nextDouble();
        System.out.println("Fizik Notu Giriniz:");
        fiz=tar.nextDouble();
        System.out.println("Kimya Notu Giriniz");
        kim=tar.nextDouble();
        System.out.println("Biyoloji Notu Giriniz");
        biy=tar.nextDouble();

            if(0<=fiz && fiz<=100){

                fiz=fiz;

            }
            else{

                fiz=0;

            }

                if(0<=kim && kim<=100){

                    kim=kim;

                }
                else{

                    kim=0;

                }

                    if(0<=biy && biy<=100){

                        biy=biy;

                    }
                    else{

                        biy=0;

                    }

                        if(0<=tur && tur<=100){

                            tur=tur;

                        }
                        else{

                            tur=0;

                        }

                            if(0<=mat && mat<=100){

                                mat=mat;

                            }
                            else{

                                mat=0;
                            }

                                Double ort=((mat+fiz+kim+tur+biy)/5);

                                    if(ort>60){

                                    System.out.println("ortalamanız"+ort);

                                    System.out.println("Geçtiniz");

                                    }

                                    else{
                                    
                                    System.out.println("ortalamanız"+ort);
                                    
                                    System.out.println("Kaldınız");
                                    
                                    }
                                    
                                }}