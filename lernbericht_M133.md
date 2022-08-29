# Lern-Bericht
Ramias Sierra

## Einleitung

Hier habe ich ein anderes Projekt genommen, um dann damit eine Aufgabe mit Sessions zu Programmieren. Dabei habe ich in Schritt ein eine Eingabe in UserInfoBean den Controller für die Session welches dann in Schritt 4 die Informationene dann ausgiebt.

## Was habe ich gelernt?

Das Projekt hat mich gelernt wie man eine Session für in jsf macht.

## Beschreibung

* Ich habe eine Session programmiert, welches in Schritt 1 und 2 den Namen und Nachname merkt, und in Schritt 4 sie dann ausgiebt.

Code von Schritt 1
```
            <h:inputText id="vorname" value="#{userInfoBean.vorname}"  size="30" maxlength="40" required="true"/>
```


Code von Schritt 4
```
        <h:form>
            <h:outputLabel id="antwort" value="Und ich weiss immer noch das Sie #{userInfoBean.vorname} #{userInfoBean.nachname} "/> 
        </h:form>
```

Code vom Controller
```
@Named(value = "userInfoBean")
@SessionScoped
public class UserInfoBean implements Serializable {
    /**
     * Creates a new instance of Session
     */
    public UserInfoBean() {
    }
    
    private String vorname;
    private String nachname;

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }
```
Bild von Schritt 1
![Schritt 1](https://user-images.githubusercontent.com/40291776/187175366-eaea8e6d-d1b1-4810-9d7a-eff144fdc9c6.png)

Bild von Schritt 4
![Schritt 4](https://user-images.githubusercontent.com/40291776/187175467-07add125-3875-4f49-84bd-77eff08d9dd0.png)


## Verifikation
Ich habe in Bild von Schritt 1 gezeigt was die Eingabe ist und in Bild von Schritt 4 wird dann die Ausgabe dargestellt. Dies wurde mit einer Session gemacht welches man sieht durch @Sessionscoped im Code vom Controller

# Reflektion zum Arbeitsprozess

👍 Die Recherche wie man eine Session durchführt wurde gut gemacht, was den ablauf des Projektes beschleunigte.

👎Ich habe den Fehler gemacht den Controller zuerst Session zu benennen, dadurch war das Programm vervirrt, weil es anstatt in Meiner Klasse nach meiner Methode suchen es in von einer vorgefertigten Session Klasse nach den namen der Methode suchte, welches es naturlich nicht fand.

**VBV**: Diesen Fehler werde ich mir merken und beim nächsten mal mich achten, dass ich meine Klassen besser benenne.

PS. bei weiterem Interesse habe ich die Klassen von Schritt 1 und 4 sowie den Kontroller noch beigelegt
