@Service
public class LocalService {
private LocalDAO dao;

@Autowired
public LocalService(LocalDAO dao) {

this.dao = dao;

}
}