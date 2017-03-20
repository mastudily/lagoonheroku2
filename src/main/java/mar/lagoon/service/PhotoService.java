package mar.lagoon.service;

import mar.lagoon.model.Photo;
import mar.lagoon.model.User;

import java.util.List;

/**
 * Created by lede on 4/29/16.
 */
public interface PhotoService {
    Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUser(User user);

    Photo findByPhotoId(Long photoId);

}
