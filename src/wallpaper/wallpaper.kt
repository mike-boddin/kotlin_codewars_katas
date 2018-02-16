package wallpaper

fun main(args: Array<String>) {
    println("Hello, world!")
    println(wallpaper(4.0,3.5,3.0))
}

var words: Array<String> = arrayOf("zero","one","two","three","four","five","six","seven"
        , "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen"
        , "eighteen", "nineteen", "twenty"
);

var rollLength = 0.52;
var rollWidth = 10;
var percent = 1.15;

fun wallpaper(l:Double, w:Double, h:Double):String {
    if(l*w*h==0.0){
        return words[0];
    }
    var wall = 2*(l*h + w*h) * percent;
    var roll = rollWidth * rollLength;
    var cnt = (Math.floor(wall / roll) +1).toInt();

    return words[cnt];
}