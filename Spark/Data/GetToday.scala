package kr.co.br.airobonews
import java.text.SimpleDateFormat
import java.util.{Calendar, Date}


object kangText {
  def main(args: Array[String]): Unit = {
    val date = Calendar.getInstance().getTime()
    val fmt = new SimpleDateFormat("yyyy-MM-dd")
    val now = fmt.format(date)
    println("now data "+now)
    
    //get last year
    val nowYear = new SimpleDataForamt("MM").format(data)
    val lastYear = year.toInt - 1
    println("last year "+lastYear)
  }
}


