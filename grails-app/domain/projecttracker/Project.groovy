package projecttracker

class Project {
	String name
	String description
	Date dueDate
	String toString () {
		"${name}"
	}
	static belongsTo = [owner : EndUser]
	static hasMany = [tasks: Task]
	
	
    static constraints = {
		name()
		description()
		dueDate()
    }
}
