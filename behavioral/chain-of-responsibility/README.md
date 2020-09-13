# Concept

- Decoupling of Sender and Receiver
- Receiver contains reference to next receiver
- Promotes loose coupling
- Hierarchical in nature
- Careful with large chains

### Examples
- java.util.logging.Logger#log()
- javax.servlet.Filter#doFilter()
- Spring Security Filter Chain