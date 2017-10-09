## Jets Project

### Week 2 Homework for Skill Distillery

* Working with arrays
* Working with objects
* Managing user input in a TUI
* Constructors
* Methods, parameters, return values
* Frequent Commits


For the purposes of narrative and setting, I have changed "jets" to "spacecraft". However, the exercise remains the same. 

In this space world, speed is measured by dividing by Mach1. The currency is in mu and they don't believe in pennies. 

All ASCII art has been obtained from: <a href = "http://www.ascii-art.de/">ASCII Art Dictionary</a>

Things I would still like to accomplish:
* User Story #7 - Assign a random pilot to each jet that is created
	I had a problem with this since I could assign a random pilot to each spaceship. However, it would assign the same pilot to multiple spaceships (since it was picking them at random each time). I think in order to complete this user story, I would have to find a way to exclude the pilots that had already been chosen. This would require at least a boolean to determine whether the pilot had been chosen or not. 
* User Story #8 - Users can hire pilots
	I was unable to accomplish this user story because I didn't quite figure out how to assign a pilot to a specific ship in the array. See notes in the JetMain and SpaceCraft.