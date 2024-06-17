object diskArea{
    def circleArea(r:Double):Double=r*r*math.Pi

    def main(args: Array[String]):Unit={
        printf("The area of a disk with radius 5: %.2f ",circleArea(5))
    }
}
