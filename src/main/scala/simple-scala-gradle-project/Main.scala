package example
//import com.amazonaws.services.secretsmanager.AWSSecretsManager
//import com.amazonaws.services.secretsmanager.AWSSecretsManagerClient
//import com.amazonaws.services.secretsmanager.model._
//import jdk.nashorn.internal.objects.NativeRegExp.test
//import spray.json._
//import DefaultJsonProtocol._
//import scala.util.parsing.json._
//
//object Main extends App {
//  println(List(1, 2, 3).toString)
//  val secret_name = "dev/postgres"
//  val region_name = "us-west-2"
//  val jsonAst = call_secret(secret_name,region_name)
//  print(jsonAst.getClass())
//  print(jsonAst)
//  print(jsonAst.fields("gw_access_key").convertTo[String])
//
//
//  def call_secret(secret_name:String,region_name:String) : spray.json.JsObject = {
//    //  val secretsmanager_client = AWSSecretsManagerClient.builder.withCredentials(aws_credentials).withRegion(region).build
//    val secretsmanager_client = AWSSecretsManagerClient.builder.withRegion(region_name).build
//
//    val getSecretValueRequest = new GetSecretValueRequest().withSecretId(secret_name)
//    val getSecretValueResult = secretsmanager_client.getSecretValue(getSecretValueRequest)
//    val secret = getSecretValueResult.getSecretString()
//    secret.parseJson.asJsObject
//  }
//}

//import org.json4s._
//import org.json4s.jackson.JsonMethods._
//import org.json4s.jackson.JsonMethods.{asJsonNode, parse}

object Main extends App {
//  implicit val formats = org.json4s.DefaultFormats
//  val jsonString = "{\\\"gw_postgres_usr\\\":\\\"gwdevuser\\\",\\\"gw_postgres_usr_pwd\\\":\\\"NoblrUSAA@GW3\\\",\\\"postgresuser\\\":\\\"postgres\\\",\\\"postgrespwd\\\":\\\"GbPG7AecTYLL\\\",\\\"gwpostgresreaduser\\\":\\\"gwdevreaduser\\\",\\\"gwpostgresreaduserpwd\\\":\\\"gwdevreaduser@1\\\",\\\"gw_access_key\\\":\\\"wNDXNxl6W75CVp9zRrP9Fh9kxNf9se61/ajQ0rVU\\\",\\\"gw_secret_key\\\":\\\"AKIAVH2XK3RJMVYX44LM\\\"}\""
//  val json = parse(jsonString)

//  print(parse(""" { "numbers" : [1, 2, 3, 4] } """))
  val secret =  new GetSecretValue()
  print(secret.Secret_values())
    val test =  new test()
    print(test.check())
}






