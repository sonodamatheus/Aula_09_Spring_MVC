public class MapeamentoController {

private TipoService ts;
private CidadeService cs;
private LocalService ls;

@Autowired
public MapeamentoController(TipoService ts, CidadeService cs,

LocalService ls ) {

this.ts = ts;
this.cs = cs;
this.ls = ls;

}

