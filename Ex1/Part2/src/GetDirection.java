import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/")
public class GetDirection {
    DataDao dataDao = new DataDao();
    @GET
    @Produces("text/xml")
    public List<Data> getClichedMessage(@QueryParam("latitudeA") double latitudeA, @QueryParam("longitudeA") double longitudeA,
                                  @QueryParam("latitudeB") double latitudeB, @QueryParam("longitudeB") double longitudeB) {
        // Return some cliched textual content
        final int R = 6371;
        double latitudeDistance = Math.toRadians(latitudeB - latitudeA);
        double longitudeDistance = Math.toRadians(longitudeB - longitudeA);
        double alpha = Math.sin(latitudeDistance / 2) * Math.sin(latitudeDistance / 2)
                + Math.cos(Math.toRadians(latitudeA)) * Math.cos(Math.toRadians(latitudeB))
                * Math.sin(longitudeDistance / 2) * Math.sin(longitudeDistance / 2);
        double beta = 2 * Math.atan2(Math.sqrt(alpha),Math.sqrt(1 - alpha));
        double result = R * beta * 1000;
        result = Math.pow(result,2) + Math.pow(0,2);
        return dataDao.getAllUsers(latitudeA,latitudeB,longitudeA,longitudeB,result);
        //return Math.sqrt(distance);
    }
}