object test extends App{
	val test1 = (1 to 1000000).toList
	val start = System.currentTimeMillis()
	test1.par map(_+1)
	val end = System.currentTimeMillis()
	println("test1: " + (end - start)/1000 + "秒")

	val start2 = System.currentTimeMillis()
	test1.par foreach(_+1)
	val end2 = System.currentTimeMillis()
	println("test2: " + (end2 - start2)/1000 + "秒")

}