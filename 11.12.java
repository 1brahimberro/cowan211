{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 AndaleMono;}
{\colortbl;\red255\green255\blue255;\red171\green173\blue176;\red35\green37\blue41;}
{\*\expandedcolortbl;;\cssrgb\c72549\c73333\c74510;\cssrgb\c18431\c19216\c21176;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs28 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 package CowanHW;\
\
import java.util.Scanner;\
import java.util.*;\
\
\
public class HW112\{\
\
    public static void main(String[] args) \{\
\
    ArrayList<Double> numbers = new ArrayList<Double>();\
    System.out.println("\\nEnter five numbers");\
\
    double i,n=0,s=0;\
    for (i=0;i<5;i++)\
        \{\
            Scanner in = new Scanner(System.in);\
            n = in.nextDouble();\
            numbers.add(n);\
            \
        \}\
\
        sum(numbers);\
\
    \};\
\
\
\
\
    public static double sum(ArrayList<Double> numList)\{\
\
        double sum = 0;\
        for (int i = 0; i < numList.size(); i++)\
            sum += numList.get(i);\
        System.out.println("The sum is "+sum);\
        return sum;\
    \}\
\
\};}