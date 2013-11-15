package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.Task

object Application extends Controller {

    /*
    def index = Action {
        Ok(views.html.index("Your new application is ready. Coucou ! xx "))
    }
    */
    def index = Action
    {
        Ok("Coucou !!")
        Redirect(routes.Application.tasks)
    }

    def tasks= Action
    {
        Ok(views.html.index(Task.all(), taskForm))
    }

    def newTask = TODO

    val taskForm = Form("label" -> nonEmptyText)

    def deleteTask(id: Long) = TODO


}
