{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
import java.io.*;\
\
public class Exercise_12_12 \{\
\
	public static void main(String[] args) throws Exception \{\
\
		if (args.length != 1) \{\
			System.out.println("Java Exercise_12_12 file");\
			System.exit(1);\
		\}\
\
\
		File file = new File(args[0]);\
\
\
		if (!file.exists()) \{\
			System.out.println("File " + args[0] + " does not exist");\
			System.exit(2);\
		\}\
\
\
		ArrayList<String> list = new ArrayList<>();\
		String stringOne = "";\
		String stringTwo = "";\
\
		try (\
\
			Scanner input = new Scanner(file);\
		) \{\
\
			stringOne = input.nextLine();\
			while (input.hasNext()) \{\
				stringTwo = input.nextLine();\
				if (stringTwo.length() > 0 && \
					 stringTwo.charAt(stringTwo.length() - 1) == '\{') \{\
					list.add(stringOne.concat(" \{"));\
					stringOne = input.nextLine();\
				\}\
				else \{\
					list.add(stringOne);\
					stringOne = stringTwo;\
				\}\
			\}\
			list.add(stringOne);\
		\}\
\
\
		try (\
\
			PrintWriter output = new PrintWriter(file);\
		) \{\
			for (int i = 0; i < list.size(); i++) \{\
				output.println(list.get(i));\
			\}\
		\}\
	\}\
\}}