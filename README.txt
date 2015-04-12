Grail Quest - Brian Varley / G00290342

CONTENTS 
---------------------
   
 * Introduction
 --------------
 
 Grail Quest is an interactive text adventure game, based on period following the battle
 of Hattin. As a Templar knight, having survived the battle,you have been entrusted with going to Jerusalem, taking the Holy Grail from the Temple
 Mount and brining it safely to Cyprus, via the port of Antioch. 
 
 
 * Requirements
  --------------
 
 This module requires the following components:
 
 * Java 1.5 or greater. To check your Java version
 * execute the following command in your command prompt
 * "java -version"
 *Available for download from here: http://goo.gl/JkgLEW
 
 
 * Installation
  --------------
 
 * Open Command Prompt
 * Execute the following commands:
 * cd desktop (if located on desktop)
   otherwise  cd "jar file location path.."
 * java –jar fuzzy.jar

 
 * Game Controls
  --------------
 
 * Directions: North, South, West, East
 * move (Used in conjunction with directions, eg move North)
 * pickUp (Used in conjunction with items, eg pickUp Medicine)
 * use (Used in conjunction with items, eg use sword)
 * attack(Used in conjunction with Character type, eg Kill Saracen)
 
 
 * Troubleshooting
  --------------
  
  * Error: "Could not find or load main class.."
  # Solution: Double check that you have entered the correct
    jar file name, "fuzzy.jar"
  
  * Error: "Jar file doesn't run after executing command."
  # Solution: Check that the jar file has been extracted from
    its .zip archive.
  
  **For any further queries, please refer to the game's GitHub:
   https://github.com/BrianJVarley/G00290342_Grail_Quest_3
 
 
 
 * Design Critiques & Notes
  --------------
  
  *I had originally planned to create the graph on the fly
   from the parsed in Game file in resourceS. But the file path
   specified to the resource didn't work when the application
   was exported to a Jar file. The parsing does work at the moment
   if you uncomment the call to parse() in main and run from
   Eclispe.  
  * Game Character / Observers should be using a mix
    of search algorithms based on their character type
    rather than just one.
  * Map could have involved more variables such as plateaus,
    to demonstrate the effectiveness of the search algorithms
    and more route options, instead of a hierarchial map.
  * A greater variance of objects and inventory could be added to 
    improve game play variables and experience.
    
    
  * Code References
  --------------
  
  http://www.mkyong.com/java/how-to-convert-java-object-to-from-json-jackson/
  
  https://github.com/Progether/JAdventure
  
  https://github.com/FasterXML/jackson-docs
  
  http://www.javacoffeebreak.com/text-adventure/
  
  http://en.wikibooks.org/wiki/Artificial_Intelligence/Search/Heuristic_search/Beam_search
 
  http://jfuzzylogic.sourceforge.net/html/example_fcl.html 
  
  https://github.com/jgrapht/jgrapht
  
  http://stackoverflow.com/questions/20242961/getting-weighted-graphs-to-work-in-jgrapht
  
  
  
  
  
  
  
 
 
 