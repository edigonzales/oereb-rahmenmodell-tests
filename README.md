# oereb-rahmenmodell-tests

`java -jar ~/Apps/ili2pg-3.10.10/ili2pg.jar --dbhost geodb-dev.cgjofbdf5rqg.eu-central-1.rds.amazonaws.com --dbdatabase xanadu2 --dbusr stefan --dbpwd XXXXXXXX --nameByTopic --disableValidation --defaultSrsCode 2056 --strokeArcs --sqlEnableNull --createGeomIdx --createFk --createFkIdx --createEnumTabs --beautifyEnumDispName  --createBasketCol --createDatasetCol --models OeREBKRM09gs --dbschema oereb_oerebkrm09gs --schemaimport`

`java -jar ~/Apps/ili2pg-3.10.10/ili2pg.jar --dbhost geodb-dev.cgjofbdf5rqg.eu-central-1.rds.amazonaws.com --dbdatabase xanadu2 --dbusr stefan --dbpwd XXXXXXXX --nameByTopic --disableValidation --defaultSrsCode 2056 --strokeArcs --sqlEnableNull --createGeomIdx --createFk --createFkIdx --createEnumTabs --beautifyEnumDispName  --createBasketCol --createDatasetCol --models OeREBKRM09trsfr --dbschema oereb_oerebkrm09trsfr --schemaimport`

    downloadURL = "http://data.geo.admin.ch/${project.name}/"

include ':ch.bav.kataster-belasteter-standorte-oev.oereb'
include ':ch.bazl.sicherheitszonenplan.oereb'
include ':ch.bazl.kataster-belasteter-standorte-zivilflugplaetze.oereb'
include ':ch.bazl.projektierungszonen-flughafenanlagen.oereb'

