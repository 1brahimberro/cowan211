{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 AndaleMono;\f1\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue255;\red0\green0\blue0;
}
{\*\expandedcolortbl;;\cssrgb\c0\c1\c1;\cssrgb\c100000\c100000\c99985;\cssrgb\c0\c0\c0;
}
{\*\listtable{\list\listtemplateid1\listhybrid{\listlevel\levelnfc23\levelnfcn23\leveljc0\leveljcn0\levelfollow0\levelstartat1\levelspace360\levelindent0{\*\levelmarker \{none\}.}{\leveltext\leveltemplateid1\'01.;}{\levelnumbers;}\fi-360\li720\lin720 }{\listname ;}\listid1}}
{\*\listoverridetable{\listoverride\listid1\listoverridecount0\ls1}}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\tx220\tx720\pardeftab720\li720\fi-720\sl270\partightenfactor0
\ls1\ilvl0
\f0\fs21 \cf2 \cb3 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 import static org.junit.jupiter.api.Assertions.*;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 import org.junit.jupiter.api.Test;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 import org.junit.Assert;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 import org.junit.jupiter.api.Test;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 class TESTreadInput \{\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   int testDay = 1;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   int testMonth = 2;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   int testYear = 2000;\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   @Test\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   public void testGetMonth()\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \{\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4       Date date = new Date(1,1,2000);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4       date.getMonth();\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4       Assert.assertEquals(1,1);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \}\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   @Test\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   public void testReadInputYear() \{\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     Date date = new Date(testDay, testMonth, testYear);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     Assert.assertTrue(date.getYear() == testYear);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \}\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   @Test\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4  \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   public void testReadInputMonth() \{\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     Date date = new Date(testDay, testMonth, testYear);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     Assert.assertTrue(date.getMonth() == testMonth);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \}\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   @Test\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   public void testReadInputDay() \{\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     Date date = new Date(testDay, testMonth, testYear);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     Assert.assertTrue(date.getDay() == testDay);\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4   \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4     \}\
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \
\ls1\ilvl0\cf2 \cb3 \kerning1\expnd0\expndtw0 \outl0\strokewidth0 {\listtext	.	}\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec4 \}\uc0\u8232 
\fs18 \cf2 \cb1 \uc0\u8232 
\f1\fs24 \cf2 \uc0\u8232 
\fs32 \cf2 \uc0\u8232 \u8232 \
}