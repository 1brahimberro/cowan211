{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 public class Student\
		extends Person \{\
	private int status;\
	public final static int FRESHMAN = 1;\
	public final static int SOPHOMORE = 3;\
	public final static int JUNIOR = 2;\
	public final static int SENIOR = 4;\
\
	public Student(String name, String address,  \
		String phone, String email, int status) \{\
		super(name, address, phone, email);\
		this.status = status;\
	\}\
\
	/** Set new status */\
	public void setStatus(int status) \{\
		this.status = status; \
	\}\
\
	/** Return status */\
	public String getStatus() \{\
		switch (status) \{\
			case 1 : return "freshman"; \
			case 2 : return "sophomore"; \
			case 3 : return "junior"; \
			case 4 : return "senior";\
			default : return "Unknown"; \
		\}\
	\}\
\
	/** Return a string discription of the class */\
	public String toString() \{\
		return super.toString() + "\\nStatus: " + getStatus();\
	\}\
\}}