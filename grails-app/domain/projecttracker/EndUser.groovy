package projecttracker

class EndUser {
	String username
	String password
	String fullname
	String toString() {
		"${fullname}"
	}
	static hasMany = [projects : Project, tasks : Task]
	
    static constraints = {
		fullname()
		username()
		password()
    }
}
