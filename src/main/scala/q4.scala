object price{
    def costPrice(n:Int):Double=24.95*n
    def discount(n:Int):Double=0.4*costPrice(n)
    def shippingCost(n:Int):Double={
        if(n>=50) 3*50+(n-50)*0.75
        else 3*n}
    def totalCost(n:Int):Double=costPrice(n)-discount(n)+shippingCost(n)
    def main(args: Array[String]):Unit={
        printf("The total wholesale cost for 60 copies: %.2f ",totalCost(60))
    }
}
