/* Generated By:JJTree: Do not edit this line. ASTCallSpecTail.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTCallSpecTail extends SimpleNode {
  public ASTCallSpecTail(int id) {
    super(id);
  }

  public ASTCallSpecTail(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=41f32fa8ce752034d45a0d160d0b6e34 (do not edit this line) */