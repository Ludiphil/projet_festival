# Atelier développement d'une application mobile

    Dans le cadre de la matière de développement mobile nous avons à concevoir et développer une API(Application Programmation Interface) et une application mobile de gestion de festival. Tout d'abord, je tiens à préciser la définition du terme API que je ne connaissais pas avant d'avoir eu ce projet. Voici un schéma qui permet de visualiser où se trouve une API :

![](C:\Users\jocel\AppData\Roaming\marktext\images\2021-12-05-16-45-23-image.png)

Le mot "interface" présent dans l'acronyme API indique bien l'objectif de celle-ci qui a pout but de faire de l'échange mutuel de données entre le serveur et l'application.     Pour présenter ce projet, je vais procéder en plusieurs étapes. D'abord, je vais présenter les différents choix techniques que j'ai fait. Puis, j'évoquerai l'application et son fonctionnement. Je vais ensuite expliquer le fonctionnement de mon API. En outre, j'aborderai la sécurité de l'application. Enfin, je révélerai les différentes futurs évolutions de mon projet.

## Choix techniques

    Etant donné que nous devons développer une application mobile, nous devons donc faire le choix d'un langage qui permet de la développer. Malgré le fait que j'ai pu pratiquer le swift lors de mon cursus universitaire je trouve que ce langage est trop ciblé car il ne permet que de développer une application pour les téléphones ayant le système d'exploitation iOs. J'ai donc choisi le flutter qui nous a été présenté assez récemment lors du début d'année pour plusieurs raisons : 

- Le flutter permet de pouvoir déployer son application mobile sur n'importe quelle plateforme que ce soit pour un téléphone Android ou iOs. Ce langage permet donc une plus grande visibilité sur l'application du fait du plus grand nombre d'utilisateur que cette application peut toucher. 

- Il s'agit du **framework le plus utilisé par les développeurs** depuis cette année en dépassant le React Native développé par l'entreprise Facebook renommée Meta recemment. Le React Native paru dès 2015 est pourtant très utilisé par des entreprises influentes comme Walmart, Instagram, Airbnb, Tesla et bien d'autres.
  
  ![](C:\Users\jocel\AppData\Roaming\marktext\images\2021-12-05-17-39-00-image.png)
  
  *Schéma illustrant un pourcentage de dévelopeurs utilisant le framework Flutter depuis 2019 source : [Cross-platform mobile frameworks used by global developers 2021 | Statista](https://www.statista.com/statistics/869224/worldwide-software-developer-working-hours/)*
  
  Ce langage possède donc une **grand communauté** ce qui induit des **forums d'aides très actifs** qui sont très utiles lorsque l'on rencontre une difficulté particulière.

- Je trouve que le flutter est **assez intuitif** et **simple à apprendre**

    Comme le précise le projet je dois également développer une API. Mes recherches aboutissent sur le concept REST. Cela répond totalement au besoin demandé par le projet. En effet, la demande se porte sur l'ajout, la modification et la suppression des artistes, évènements et utilisateurs. Tout ceci correspond au modèle CRUD ("Create Read Update Delete" en français "créer lire modifier et supprimer"). 

    REST signifie "REpresentational State Transfer", il a été proposé par Roy Fielding en 2000 comme étant une approche architecturale de la conception de services web. Voici une citation que j'ai pu trouver et qui illustre très bien le concept REST : *"L’API REST est au développeur ce que l’interface utilisateur est à l’utilisateur final, une méthode de communication avec un serveur."* [Les bonnes pratiques à suivre pour développer des APIs REST – Gekko](https://www.gekko.fr/les-bonnes-pratiques-a-suivre-pour-developper-des-apis-rest/)

    Les services web utilisant le style architectural REST sont nommés services web RESTful. Ils sont donc normés et uniformisés dans le but d'accéder aux ressources web et de les manipuler. Un système RESTful se base sur un concept assez simple qui est le suivant : un client va demander une ressource et le serveur va posséder ces ressources.

    Afin que notre API respecte les normes et devienne RESTful, nous allons devoir respecter les six contraintes qui sont :

- Architecture Client/Serveur

- Stateless (sans-état)

- Cacheable (cachable)

- Layered system (système à plusieurs couches)

- Uniform Interface (Interface uniforme)

- Code on demand (Code sur demande)

    Ce concept est très associé au web donc au protocole HTTP (HyperText Transfer Protocol) mais il n'y est pas forcément lié. Je vais utiliser ce dernier protocole pour le travail qui m'est demandé. Il va m'être utile pour faire le lien entre l'application mobile et l'API. Avec le schéma que j'ai réalisé ça se situe ici :

![](C:\Users\jocel\AppData\Roaming\marktext\images\2021-12-05-23-09-49-image.png)

Après différentes recherches plusieurs choix s'offrent à moi :

- développer en 

API développée en Java Spring :

- Basé sur du Java : langage de programmation permettant d'écrire un programme une seule fois qui soit exécutable n'importe où : "*Write once run everywhere*". Spring boot framework est une plate-forme Java open source utilisée pour créer un microservice.

## Application

## Fonctionnement de l'application

## Fonctionnement de l'API

## Sécurité de l'application

## Les futurs évolutions souhaitées
