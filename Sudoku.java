public class Sudoku{ //弄弄⼗十的原因是为了了好记忆，0,0不不⽤用，只⽤用1-9的list
private ArrayList<Integer>[][] availableNum=new ArrayList[10][10]; private int[][] correctNum=new int[10][10];
private Scanner scan=new Scanner(System.in);
private int countNum=0;
{
for(int i=0;i<10;i++){
for(int j=0;j<10;j++){ availableNum[i][j]=new ArrayList<>();
} }
for(int row=1;row<10;row++){ for(int col=1;col<10;col++){
 for(int i=1;i<10;i++) availableNum[row][col].add(new Integer(i));
} }
//先都初始化为-1，即此时没有填充数字 for(int i=0;i<10;i++)
for(int j=0;j<10;j++) correctNum[i][j]=-1;
}
public Sudoku(){}
//在对应数独位置插⼊入正确值
public void insert(int row,int col,int value){
correctNum[row][col]=value; availableNum[row][col]=null; delete(row,col,value);
} //每插⼊入⼀一个数值，就删除相应的⾏行行列列和⼩小框框3X3数独⾥里里对应的ArrayList⾥里里可能的该值 public void delete(int row,int col,int value){
//delte row
for(int i=1;i<10;i++){
if (availableNum[row][i]!=null) availableNum[row][i].remove(new Integer(value));
}
//delete column for(int i=1;i<10;i++){
if (availableNum[i][col]!=null) availableNum[i][col].remove(new Integer(value));
}
//delete box num
int[] itsCenter=judgeCenterPos(row,col);
for(int temp1=itsCenter[0]-1;temp1<=itsCenter[0]+1;temp1++)
for(int temp2=itsCenter[1]-1;temp2<=itsCenter[1]+1;temp2++) if(availableNum[temp1][temp2]!=null){
availableNum[temp1][temp2].remove(new Integer(value)); }
}
//判断插⼊入的值时处于哪个⼩小框框数独⾥里里 public int[] judgeCenterPos(int row,int col){
int[] itsCenter=new int[2];
for(int centerRow=2;centerRow<9;centerRow+=3)
for(int centerCol=2;centerCol<9;centerCol+=3){ if( Math.abs(row-centerRow)<=1 &&
Math.abs(col-centerCol)<=1 ){ itsCenter[0]=centerRow; itsCenter[1]=centerCol;
return itsCenter;

}
}
System.out.println("Some unchecked error was happened"); return itsCenter;
}
//判断空格⾥里里所能填的数字是不不是只能有⼀一个,当返回-1时通过检测报错 public int[] judgeIfOnlyOne(){
for(int row=1;row<10;row++) for(int col=1;col<10;col++){
if(availableNum[row][col]!=null) if(availableNum[row][col].size()==1)
return new int[]{row,col}; }
return new int[]{-1,-1}; }
// 判断为唯⼀一，但是空格⾥里里还有多于1个的数时，我们直接将哪个正确的值填⼊入 public void insertIfCan(){
for(int row=1;row<=7;row+=3){ for(int col=1;col<=7;col+=3){
for(int z=1;z<10;z++){
int count=0;
Integer temp=new Integer(z); int itemp=0,jtemp=0;
outer:
for(int i=row;i<row+3;i++){
for(int j=col;j<col+3;j++){ if(availableNum[i][j]!=null){
if(availableNum[i][j].contains(temp)){ count++;
itemp=i;
jtemp=j;
if (count>1) break outer;
} }
} }
if(count==1 && itemp!=0){ insert(itemp,jtemp,z);
} }
} }
}
