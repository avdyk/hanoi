# hanoi

## Installation, implémentation et lancement du projet

### Introduction

Exercice des tours de Hanoï en Java. Cet exercice fait travailler la récursivité, les piles.

Pour une explication sur le principe des tours de Hanoï: [http://fr.wikipedia.org/wiki/Tours_de_Hano%C3%AF Tours de Hanoï sur Wikipedia.org]

### Détails

 * Téléchargez l'api, ajoutez la dans votre {{{CLASSPATH}}}.
 * Implémentez les interfaces {{{ste.hanoi.ITour}}} et {{{ste.hanoi.IHanoi}}}.
 * Dans votre projet, créez un fichier {{{META-INF/services/ste.hanoi.IHanoi}}} avec comme contenu, le nom complet de la classe qui implémente l'interface {{{ste.hanoi.IHanoi}}}
 * Lancez l'application avec la ligne de commande: {{{java -classpath hanoi-api-1.0.jar:chemin_vers_vos_classes ste.hanoi.Main}}} (le : est remplacé par ; sous Windows)
