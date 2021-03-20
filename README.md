# MadLib

Sie sollen eine Klasse schreiben, die auf Basis gegebener Adjektive, Verben und bekannter Personen zufällige Aussagen über Java generiert. In der Klasse `MadLib` sehen Sie, dass Ihnen bereits eine Auswahl an Adjektiven, Verben und bekannten Personen zur Verfügung stehen. Arbeiten Sie bitte nur mit diesen Arrays.

Die Methode `create()` muss von Ihnen implementiert werden und eine Aussage über Java erzeugen. Das Muster der Aussage ist dabei immer gleich:

```
Java programming is so {{ random adjective }}! It makes me so excited all the time because I love to {{ random verb }}. Stay hydrated and {{ other random verb }} like you are {{ random famous person }}!
```

Hinweise:
- Für den Platzhalter `{{ random adjective }}` muss ein zufälliges Adjektiv aus dem zur Verfügung stehenden String Array `ADJECTIVES` eingesetzt werden.
- Für den Platzhalter `{{ random verb }}` und `{{ other random verb }}` müssen jeweils ein zufälliges Verb aus dem zur Verfügung stehenden String Array `VERBS` eingesetzt werden.
- Für den Platzhalter `{{ random adjective }}` muss eine zufällige bekannte Person aus dem zur Verfügung stehenden String Array `FAMOUS_PERSONS` eingesetzt werden.
- Zufällig heißt in diesem Kontext, dass nicht Sie selbst ein Wort aus dem Array wählen, sondern Ihr Programm soll mit jeder Ausführung ein Wort per Zufall aus dem Array entnehmen.
- Folgende Aussagen über Java könnten von Ihrem Programm erzeugt werden:
  - *Java programming is so exciting! It makes me so excited all the time because I love to destroy. Stay hydrated and cry like you are Winnie Pooh!*
  - *Java programming is so beautiful! It makes me so excited all the time because I love to compete. Stay hydrated and battle like you are Iron Man!*
  - *Java programming is so difficult! It makes me so excited all the time because I love to concentrate. Stay hydrated and compete like you are John Wick!*
  - ...viele Kombinationen mehr
- Es kann ggf. sinnvoll sein, der Klasse `MadLib` private Methode hinzuzufügen, um Code-Duplizierungen zu vermeiden.

1. Implementieren Sie die Methode `create()` in der Klasse `MadLib` wie oben spezifiziert.
1. Schreiben Sie mind. einen Unit-Test, der Ihre Implementierung testet. Da Ihre Implementierung zufällige Strings erzeugt, ist das Testen hier gar nicht so einfach. Testen Sie daher mind., dass der zurückgegebene String nicht `null` ist und mit `Java programming is so` beginnt.
1. Schreiben Sie einen weiteren Test, der prüft, ob der zurückgegebene String von `create()` mind. 1 Adjektiv aus dem Array `ADJECTIVES` beinhaltet, 1 Verb aus dem Array `VERBS` sowie 1 Person aus dem Array `FAMOUS_PERSONS`.
