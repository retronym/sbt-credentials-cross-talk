val Realm = "Realm"
val Host = "host.org"
val Pass = "Pass"

def publishSetting = {
  publish := {
    ivySbt.value
    val creds = org.apache.ivy.util.url.CredentialsStore.INSTANCE.getCredentials(Realm, Host)
    println(s"${name.value}: ${creds}")
    ()
  }
}


publishSetting

ThisBuild/publishTo := Some("dummy" at "https://dummy.com")

val a = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val b = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val c = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val d = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val e = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val f = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val g = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val h = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val i = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val j = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val k = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val l = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val m = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val n = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
val o = project.settings(credentials += Credentials(Realm, Host, "user-" + name.value, Pass), publishSetting)
