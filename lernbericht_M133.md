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

![Schritt 1](https://user-images.githubusercontent.com/40291776/187175366-eaea8e6d-d1b1-4810-9d7a-eff144fdc9c6.png)
![Schritt 4](https://user-images.githubusercontent.com/40291776/187175467-07add125-3875-4f49-84bd-77eff08d9dd0.png)


## Verifikation

Bsp.


Hier habe ich #{userInfoBean.vorname} genutzt um die Variable vorname die von Schritt 1 mit der Session abgespeichert wurde wieder auszugeben

# Reflektion zum Arbeitsprozess

👍 Überlegen Sie sich jeweils etwas, was gut an Ihrer Arbeit lief; 

👎 und etwas, was nicht gut lief.

**VBV**: ✍️ Formulieren Sie davon ausgehend einen *handelbaren* Verbesserungsvorschlag.
