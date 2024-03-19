// package controllers

// import java.time.LocalDateTime
// import javax.inject.{Inject, Singleton}
// import domain.repository.PicturePropertyRepository
// import play.api.libs.json.Json
// import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}

// import scala.concurrent.ExecutionContext

// @Singleton
// class PropertiesController @Inject()(cc: ControllerComponents,
//                                      picturePropertyRepository: PicturePropertyRepository,
//                                     ) extends AbstractController(cc) {

//   implicit val ec: ExecutionContext = cc.executionContext

//   def getAll(lastCreatedDate: Option[String]): Action[AnyContent] = Action.async {
//     val localDateTime = lastCreatedDate.map(LocalDateTime.parse).getOrElse(LocalDateTime.parse("0000-01-01T00:00:00"))
//     picturePropertyRepository.findAllByDateTime(localDateTime).map(properties => {
//       Ok(Json.toJson(properties)).as("application/json")
//     })
//   }
// }