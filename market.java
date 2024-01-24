class product
{
 public static void main(String args[])
 {
  String name="samsungS22ultra";
    intproductcode=6556743;
    double discount,coupondiscount;
    
    int price=98000;
    int quantity=1;
    string couponcode="codinghub";
    int total1;
    double total2;

    doublecgst,sgst;
    double total=price*quantity;
    System.out.println("total price:"+total);
    
    if(total>10000)
    { 
     discount=(17.0/100*total);
    }    
     else
      {
       discount=(3.0/100*total);
       }
    System.out.println("discount:"+discount);
    total=(int)(total-discount);
    System.out.printn("after adding discount total:"+total);
     cgst=(9.0/100)*total;
     sgst=(9.0/100)*total;
     total=total+cgst+sgst;
   System.out.println("total price after cgst and sgst:"+total);
    if(couponcode=="codinghub")
    {
     coupondiscount=(25.0/100)*total;
         total=(int)(total-coupondiscount);
        System.out.println("coupondiscount:"+coupondiscount);
       System.out.println("total price after adding coupon code:"+total);
  }
 }