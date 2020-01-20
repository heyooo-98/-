{\rtf1\ansi\ansicpg936\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset134 STSongti-SC-Regular;\f2\fnil\fcharset129 AppleMyungjo;
\f3\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red252\green252\blue252;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;\cssrgb\c99216\c99216\c99216;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl300\sa240\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \cb3 \expnd0\expndtw0\kerning0
public class Sudoku\{ //
\f1 \'c5\'aa
\f2 \'d2\'d7
\f1 \uc0\u12055 \'ca\'ae\'b5\'c4\'d4\'ad\'d2\'f2\'ca\'c7\'ce\'aa\'c1\'cb
\f2 \'e8\'e7\'fb\'bf
\f1 \'bc\'c7\'d2\'e4\'a3\'ac
\f0 0,0
\f1 \'b2\'bb
\f2 \'dd\'d5
\f1 \uc0\u12132 \'d3\'c3\'a3\'ac\'d6\'bb\u12132 \'d3\'c3
\f0 1-9
\f1 \'b5\'c4
\f0 list\cf2 \cb1 \uc0\u8232 \cf2 \cb3 private ArrayList<Integer>[][] availableNum=new ArrayList[10][10]; private int[][] correctNum=new int[10][10];\cf2 \cb1 \uc0\u8232 \cf2 \cb3 private Scanner scan=new Scanner(System.in);\cf2 \cb1 \uc0\u8232 \cf2 \cb3 private int countNum=0; 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \{\cf2 \cb1 \uc0\u8232 \cf2 \cb3 for(int i=0;i<10;i++)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int j=0;j<10;j++)\{ availableNum[i][j]=new ArrayList<>(); 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int row=1;row<10;row++)\{ for(int col=1;col<10;col++)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int i=1;i<10;i++) availableNum[row][col].add(new Integer(i)); 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 //
\f1 \'cf\'c8\'b6\'bc\'b3\'f5\'ca\'bc\'bb\'af\'ce\'aa
\f0 -1
\f1 \'a3\'ac\'bc\'b4\'b4\'cb\'ca\'b1\'c3\'bb\'d3\'d0\'cc\'ee\'b3\'e4\'ca\'fd\'d7\'d6
\f3  
\f0 for(int i=0;i<10;i++) 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int j=0;j<10;j++) correctNum[i][j]=-1; 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \}\cf2 \cb1 \uc0\u8232 \cf2 \cb3 public Sudoku()\{\} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 //
\f1 \'d4\'da\'b6\'d4\'d3\'a6\'ca\'fd\'b6\'c0\'ce\'bb\'d6\'c3\'b2\'e5\uc0\u12042 \'c8\'eb\'d5\'fd\'c8\'b7\'d6\'b5
\f3 \cf2 \cb1 \uc0\u8232 
\f0 \cf2 \cb3 public void insert(int row,int col,int value)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 correctNum[row][col]=value; availableNum[row][col]=null; delete(row,col,value); 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} //
\f1 \'c3\'bf\'b2\'e5\uc0\u12042 \'c8\'eb\u12032 \'d2\'bb\'b8\'f6\'ca\'fd\'d6\'b5\'a3\'ac\'be\'cd\'c9\'be\'b3\'fd\'cf\'e0\'d3\'a6\'b5\'c4\u12175 \'d0\'d0
\f2 \'fa\'a1\'d6\'aa\'e6\'ea\'fb\'fa
\f1 \uc0\u12073 \'d0\'a1\'bf\'f2\'bf\'f2
\f0 3X3
\f1 \'ca\'fd\'b6\'c0\uc0\u12197 \'c0\'ef
\f2 \'ec\'c5
\f1 \'b6\'d4\'d3\'a6\'b5\'c4
\f0 ArrayList
\f1 \uc0\u12197 \'c0\'ef
\f2 \'ec\'c5\'ca\'a6\'d2\'f6\'ee\'dc
\f1 \'b8\'c3\'d6\'b5
\f3  
\f0 public void delete(int row,int col,int value)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 //delte row\cf2 \cb1 \uc0\u8232 \cf2 \cb3 for(int i=1;i<10;i++)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 if (availableNum[row][i]!=null) availableNum[row][i].remove(new Integer(value)); 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 //delete column for(int i=1;i<10;i++)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 if (availableNum[i][col]!=null) availableNum[i][col].remove(new Integer(value)); 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 //delete box num\cf2 \cb1 \uc0\u8232 \cf2 \cb3 int[] itsCenter=judgeCenterPos(row,col);\cf2 \cb1 \uc0\u8232 \cf2 \cb3 for(int temp1=itsCenter[0]-1;temp1<=itsCenter[0]+1;temp1++) 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int temp2=itsCenter[1]-1;temp2<=itsCenter[1]+1;temp2++) if(availableNum[temp1][temp2]!=null)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 availableNum[temp1][temp2].remove(new Integer(value)); \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \}\cf2 \cb1 \uc0\u8232 \cf2 \cb3 //
\f1 \'c5\'d0\'b6\'cf\'b2\'e5\uc0\u12042 \'c8\'eb\'b5\'c4\'d6\'b5\'ca\'b1\'b4\'a6\'d3\'da\'c4\'c4\'b8\'f6\u12073 \'d0\'a1\'bf\'f2\'bf\'f2\'ca\'fd\'b6\'c0\u12197 \'c0\'ef
\f2 \'ec\'c5
\f3  
\f0 public int[] judgeCenterPos(int row,int col)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 int[] itsCenter=new int[2];\cf2 \cb1 \uc0\u8232 \cf2 \cb3 for(int centerRow=2;centerRow<9;centerRow+=3) 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int centerCol=2;centerCol<9;centerCol+=3)\{ if( Math.abs(row-centerRow)<=1 && 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 Math.abs(col-centerCol)<=1 )\{ itsCenter[0]=centerRow; itsCenter[1]=centerCol;\cf2 \cb1 \uc0\u8232 \cf2 \cb3 return itsCenter; 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \}\cf2 \cb1 \uc0\u8232 \cf2 \cb3 System.out.println("Some unchecked error was happened"); return itsCenter; 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 //
\f1 \'c5\'d0\'b6\'cf\'bf\'d5\'b8\'f1\uc0\u12197 \'c0\'ef
\f2 \'ec\'c5\'e1\'b6\'d2\'f6
\f1 \'cc\'ee\'b5\'c4\'ca\'fd\'d7\'d6\'ca\'c7\'b2\'bb
\f2 \'dd\'d5\'e3\'c0\'f1\'fe\'d2\'f6\'ea\'f3
\f1 \uc0\u12032 \'d2\'bb\'b8\'f6
\f0 ,
\f1 \'b5\'b1\'b7\'b5\'bb\'d8
\f0 -1
\f1 \'ca\'b1\'cd\'a8\'b9\'fd\'bc\'ec\'b2\'e2\'b1\'a8\'b4\'ed
\f3  
\f0 public int[] judgeIfOnlyOne()\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int row=1;row<10;row++) for(int col=1;col<10;col++)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 if(availableNum[row][col]!=null) if(availableNum[row][col].size()==1) 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 return new int[]\{row,col\}; \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 return new int[]\{-1,-1\}; \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 // 
\f1 \'c5\'d0\'b6\'cf\'ce\'aa\'ce\'a8\uc0\u12032 \'d2\'bb\'a3\'ac\'b5\'ab\'ca\'c7\'bf\'d5\'b8\'f1\u12197 \'c0\'ef
\f2 \'ec\'c5
\f1 \'bb\'b9\'d3\'d0\'b6\'e0\'d3\'da
\f0 1
\f1 \'b8\'f6\'b5\'c4\'ca\'fd\'ca\'b1\'a3\'ac\'ce\'d2\'c3\'c7\'d6\'b1\'bd\'d3\'bd\'ab\'c4\'c4\'b8\'f6\'d5\'fd\'c8\'b7\'b5\'c4\'d6\'b5\'cc\'ee\uc0\u12042 \'c8\'eb
\f3  
\f0 public void insertIfCan()\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int row=1;row<=7;row+=3)\{ for(int col=1;col<=7;col+=3)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int z=1;z<10;z++)\{\cf2 \cb1 \uc0\u8232 \cf2 \cb3 int count=0;\cf2 \cb1 \uc0\u8232 \cf2 \cb3 Integer temp=new Integer(z); int itemp=0,jtemp=0;\cf2 \cb1 \uc0\u8232 \cf2 \cb3 outer:\cf2 \cb1 \uc0\u8232 \cf2 \cb3 for(int i=row;i<row+3;i++)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 for(int j=col;j<col+3;j++)\{ if(availableNum[i][j]!=null)\{ 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 if(availableNum[i][j].contains(temp))\{ count++;\cf2 \cb1 \uc0\u8232 \cf2 \cb3 itemp=i;\cf2 \cb1 \uc0\u8232 \cf2 \cb3 jtemp=j; 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 if (count>1) break outer; 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 if(count==1 && itemp!=0)\{ insert(itemp,jtemp,z); 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} \} 
\f3\fs24 \cb1 \

\f0\fs26\fsmilli13333 \cb3 \} 
\f3\fs24 \cb1 \
}