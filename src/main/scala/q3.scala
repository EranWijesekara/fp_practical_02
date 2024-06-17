object volumeSphere{
    def sphereVol(r:Double):Double=4/3*r*r*r*math.Pi

    def main(args: Array[String]):Unit={
        printf("The volume of a sphere with radius 5: %.2f ",sphereVol(5))
    }
}

