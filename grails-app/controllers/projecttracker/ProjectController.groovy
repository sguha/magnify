package projecttracker

class ProjectController {
	def scaffold = true

	/*def index = {
		redirect(action: list)
	}*/
    def current = {
		def allProjects = Project.list()
		[allProjects:allProjects]
	}
	def overdue = {
		render "Order Valentines Day Package"
	}
	
}
