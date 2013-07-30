-- API,Name,Description
-- awk -F, '{print "insert into annotation(id,api,name,usage) values(", --i, "'",$1,"',',$2,"',",$3,"')"
insert into annotation(id,api,name,usage) values(-1,'Lang', '@Override','Ensure method overrides superclass method');
CDI,@Named,Marks class as a named CDI bean
EJB3,@AroundInvoke,Mark POJO class as EJB interceptor
EJB3,@Asynchronous,Mark bean method for async invocation
EJB3,@DeclareRoles,List valid roles for bean
EJB3,@EJB,Request injection of an EJB
EJB3,@Interceptors,List interceptors to apply from this EJB class or method proxy
EJB3,@Local,Mark as Local access Bean
EJB3,@MessageDriven,Mark as a JMS message-driven bean (needs activationConfig)
EJB3,@PermitAll,Negtive override for @RolesAllowed
EJB3,@PostActivate,SFSB callback after re-activation
EJB3,@PrePassivate,SFSB callback prior to passivation
EJB3,@Remote,Mark as Remote access Bean
EJB3,@Remove,SFSB method to terminate connection to bean
EJB3,@RolesAllowed,Roles needed to access bean or method
EJB3,@Singleton,Mark bean class as Singleton
EJB3,@Stateful,Mark as Stateful Session Bean
EJB3,@Stateless,Mark as Stateless Session Bean
EJB3,@Timeout,Specify method to be invoked when EJB timer goes off
EJB3,@TransactionAttrribute,Specify transactional strategy for the method
EJB3,@TransactionManagement,Specify CMT or BMT for the EJB bean class
EJB3,@WebService,Mark SLSS as SOAP Web Service access Bean
JPA,@Column,Specify non-default name for column
JPA,@DiscriminatorColumn,Specify "type field" column in table-per-class-hierarchy
JPA,@DiscriminatorValue,Define "type field" value for beans of this type in table-per-class
JPA,@Embeddable,Class is to be used in one (or more) other classes, live in same row
JPA,@EmbeddedId,Mark the compound primary key property
JPA,@Embedded,Reference is to an embedded @Embeddable
JPA,@Entity,Mark class as a JPA entity
JPA,@GeneratedValue,Defines strategry for generating pkey of newly-persisted object
JPA,@Id,Mark the primary key property
JPA,@Inheritance,Specify how to handle inhertance (one of three strategies)
JPA,@JoinColumn,Specify name of join column
JPA,@JoinTable,Specify name of join table
JPA,@ManyToMany,Many of these to Many of those
JPA,@ManyToOne,many of these to one of those
JPA,@NamedNativeQuery,Externalize SQL query string, from action class to Entity that it operates on
JPA,@NamedQueries,Wrapper when more than one @NamedQuery on same entity
JPA,@NamedQuery,Externalize query string, from action class to Entity that it operates on
JPA,@OneToMany,One of these to many of those
JPA,@OneToOne,One of these to one of those
JPA,@PrimaryKeyJoinColumn,Name of foriegn key column in table-per-sublcass
JPA,@Table,Specify non-default name for table
JPA,@Transient,Tell JPA to NOT persist this property
JSF,@ApplicationScoped,Bean is placed in HTTP ServletContext Scope
JSF,@ManagedBean,Marks class as a JSF named bean
JSF,@ManagedProperty,Bean property comes from value attribute (usually will be an EL)
JSF,@RequestScoped,Bean is placed in HTTP Request Scope
JSF,@SessionScoped,Bean is placed in HTTP Session Scope
JSF,@ViewScoped,Bean is kept in HTTP view scope
JSR-290,@PostConstruct,Invoke after object constructed and DI done
JSR-290,@PreDestroy,Invoke before object is to be discarded
JSR-290,@Resource,Request dependency injection
JSR-303,@Email,Bean validation: must resemble a valid email address
JSR-303,@Max,Validation: Maximum value
JSR-303,@Min,Validation: Minimum value
JSR-303,@NotEmpty,Validation: Must contain at least one character
JSR-303,@NotNull,Validation: Reference variable may not be null
JSR-303,@Pattern,Validation: REGEX to match against
JSR-303,@Size,Validation: Minimum and/or maximum string length
SpringAOP,@After,Invoke advice after method returns normally or abnormally
SpringAOP,@AfterReturning,Invoke advice after method returns normally
SpringAOP,@AfterThrowing,Access thrown exception
SpringAOP,@Aspect,Defines advice class
SpringAOP,@Before,Execute this advice before calling target method
Spring,@Around,Mark @Aspect method as Around (uses ProceedingJoinPoint argument)
Spring,@Bean,Nominate method as a factory for the given Bean
Spring,@Component,Marks class as a named Spring Bean
Spring,@Configuration,Marks class as holding @Bean-annotation factory methods
Spring,@Lazy,Constrols lazy construction of Singleton bean
SpringMVC,@Controller,Mark class as MVC Constroller
SpringMVC,@ModelAttribute,Mark handler method to associate with attribute name
SpringMVC,@PathVariable,URL Template variable is bound to method parameter
SpringMVC,@RequestMapping,Define URL for this class or method (may contain template if on method)
SpringMVC,@RequestMapping,Define URL Template: extract parameters + pass to handler method
SpringMVC,@ResponseBody,Annotate response object for conversion (e.g., to XML or JSON)
SpringMVC,@Valid,Request validation of input fields
Spring,@Repository,Marks class as a DAO-like Spring Bean
Spring,@Scope,Specify string-valued component scope
Spring,@Transactional,Specify transactional strategy, optionally handle rollbacks
Sprint,@Service,Mark as a service class
