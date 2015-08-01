package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'namespace'", "'import'", "'.'", "'.*'", "'final'", "'class'", "'extends'", "'{'", "'}'", "'[]'", "'String'", "'Integer'", "'Boolean'", "'Decimal'", "'BigDecimal'", "'public'", "'private'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Namespace";	
       	}
       	
       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleNamespace"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:68:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:69:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:70:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace75);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:77:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_smallJava_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:28: ( (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:1: (otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:81:3: otherlv_0= 'namespace' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_smallJava_3_0= ruleSmallJava ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleNamespace122); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:87:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNamespace143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:103:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleNamespace164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:121:3: ( (lv_smallJava_3_0= ruleSmallJava ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:122:1: (lv_smallJava_3_0= ruleSmallJava )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:122:1: (lv_smallJava_3_0= ruleSmallJava )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:123:3: lv_smallJava_3_0= ruleSmallJava
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getSmallJavaSmallJavaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSmallJava_in_ruleNamespace186);
            lv_smallJava_3_0=ruleSmallJava();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"smallJava",
                    		lv_smallJava_3_0, 
                    		"SmallJava");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleImport"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:148:2: (iv_ruleImport= ruleImport EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:149:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport222);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:156:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:159:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:160:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:160:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport269); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:164:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:165:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:166:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCards
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCards_in_ruleImport290);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCards();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCards");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:190:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:191:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:192:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName327);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName338); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:199:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:202:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:203:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:203:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:203:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName378); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:210:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:211:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName397); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName412); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildCards"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:231:1: entryRuleQualifiedNameWithWildCards returns [String current=null] : iv_ruleQualifiedNameWithWildCards= ruleQualifiedNameWithWildCards EOF ;
    public final String entryRuleQualifiedNameWithWildCards() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCards = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:232:2: (iv_ruleQualifiedNameWithWildCards= ruleQualifiedNameWithWildCards EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:233:2: iv_ruleQualifiedNameWithWildCards= ruleQualifiedNameWithWildCards EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardsRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCards_in_entryRuleQualifiedNameWithWildCards460);
            iv_ruleQualifiedNameWithWildCards=ruleQualifiedNameWithWildCards();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCards.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCards471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCards"


    // $ANTLR start "ruleQualifiedNameWithWildCards"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:240:1: ruleQualifiedNameWithWildCards returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCards() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:243:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:244:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:244:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:245:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardsAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCards518);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:255:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:256:2: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedNameWithWildCards537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardsAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCards"


    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:269:1: entryRuleSmallJava returns [EObject current=null] : iv_ruleSmallJava= ruleSmallJava EOF ;
    public final EObject entryRuleSmallJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJava = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:270:2: (iv_ruleSmallJava= ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:271:2: iv_ruleSmallJava= ruleSmallJava EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava579);
            iv_ruleSmallJava=ruleSmallJava();

            state._fsp--;

             current =iv_ruleSmallJava; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava589); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:278:1: ruleSmallJava returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleSmallJava() throws RecognitionException {
        EObject current = null;

        Token lv_final_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_0_0 = null;

        EObject lv_attribute_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:281:28: ( ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:282:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:282:1: ( ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}' )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:282:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )? ( (lv_final_1_0= 'final' ) )? otherlv_2= 'class' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_attribute_7_0= ruleAttribute ) )* otherlv_8= '}'
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:282:2: ( (lv_visibility_0_0= ruleVisibilityTypes ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=26 && LA4_0<=27)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:283:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:283:1: (lv_visibility_0_0= ruleVisibilityTypes )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:284:3: lv_visibility_0_0= ruleVisibilityTypes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getVisibilityVisibilityTypesEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibilityTypes_in_ruleSmallJava635);
                    lv_visibility_0_0=ruleVisibilityTypes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_0_0, 
                            		"VisibilityTypes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:300:3: ( (lv_final_1_0= 'final' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:301:1: (lv_final_1_0= 'final' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:301:1: (lv_final_1_0= 'final' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:302:3: lv_final_1_0= 'final'
                    {
                    lv_final_1_0=(Token)match(input,15,FOLLOW_15_in_ruleSmallJava654); 

                            newLeafNode(lv_final_1_0, grammarAccess.getSmallJavaAccess().getFinalFinalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "final");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSmallJava680); 

                	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getClassKeyword_2());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:319:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:320:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:320:1: (lv_name_3_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:321:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava697); 

            			newLeafNode(lv_name_3_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:337:2: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:337:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSmallJava715); 

                        	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getExtendsKeyword_4_0());
                        
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:341:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:342:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:342:1: (otherlv_5= RULE_ID )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:343:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava735); 

                    		newLeafNode(otherlv_5, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSmallJava749); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:358:1: ( (lv_attribute_7_0= ruleAttribute ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=21 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:359:1: (lv_attribute_7_0= ruleAttribute )
            	    {
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:359:1: (lv_attribute_7_0= ruleAttribute )
            	    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:360:3: lv_attribute_7_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleSmallJava770);
            	    lv_attribute_7_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_7_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleSmallJava783); 

                	newLeafNode(otherlv_8, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJava"


    // $ANTLR start "entryRuleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:388:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:389:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:390:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute819);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:397:1: ruleAttribute returns [EObject current=null] : ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        Token lv_name_2_0=null;
        EObject lv_datatype_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:400:28: ( ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:401:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:401:1: ( ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:401:2: ( (lv_datatype_0_0= ruleDatatype ) ) ( (lv_array_1_0= '[]' ) )? ( (lv_name_2_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:401:2: ( (lv_datatype_0_0= ruleDatatype ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:402:1: (lv_datatype_0_0= ruleDatatype )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:402:1: (lv_datatype_0_0= ruleDatatype )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:403:3: lv_datatype_0_0= ruleDatatype
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getDatatypeDatatypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDatatype_in_ruleAttribute875);
            lv_datatype_0_0=ruleDatatype();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"datatype",
                    		lv_datatype_0_0, 
                    		"Datatype");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:419:2: ( (lv_array_1_0= '[]' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:420:1: (lv_array_1_0= '[]' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:420:1: (lv_array_1_0= '[]' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:421:3: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,20,FOLLOW_20_in_ruleAttribute893); 

                            newLeafNode(lv_array_1_0, grammarAccess.getAttributeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "array", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:434:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:435:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:435:1: (lv_name_2_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:436:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute924); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDatatype"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:460:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:461:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:462:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype965);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:469:1: ruleDatatype returns [EObject current=null] : ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        EObject this_SmallJavaType_2 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:472:28: ( ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:1: ( ( () ruleSimpleType ) | this_SmallJavaType_2= ruleSmallJavaType )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=21 && LA9_0<=25)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:2: ( () ruleSimpleType )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:2: ( () ruleSimpleType )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:3: () ruleSimpleType
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:473:3: ()
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:474:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getDatatypeAccess().getDatatypeAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSimpleTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleDatatype1026);
                    ruleSimpleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:489:5: this_SmallJavaType_2= ruleSmallJavaType
                    {
                     
                            newCompositeNode(grammarAccess.getDatatypeAccess().getSmallJavaTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSmallJavaType_in_ruleDatatype1054);
                    this_SmallJavaType_2=ruleSmallJavaType();

                    state._fsp--;

                     
                            current = this_SmallJavaType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:505:1: entryRuleSimpleType returns [String current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final String entryRuleSimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleType = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:506:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:507:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType1090);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType1101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:514:1: ruleSimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:517:28: ( (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:518:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:518:1: (kw= 'String' | kw= 'Integer' | kw= 'Boolean' | kw= 'Decimal' | kw= 'BigDecimal' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:519:2: kw= 'String'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSimpleType1139); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:526:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSimpleType1158); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getIntegerKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:533:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSimpleType1177); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBooleanKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:540:2: kw= 'Decimal'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleSimpleType1196); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getDecimalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:547:2: kw= 'BigDecimal'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleSimpleType1215); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBigDecimalKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleSmallJavaType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:560:1: entryRuleSmallJavaType returns [EObject current=null] : iv_ruleSmallJavaType= ruleSmallJavaType EOF ;
    public final EObject entryRuleSmallJavaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJavaType = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:561:2: (iv_ruleSmallJavaType= ruleSmallJavaType EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:562:2: iv_ruleSmallJavaType= ruleSmallJavaType EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaTypeRule()); 
            pushFollow(FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType1255);
            iv_ruleSmallJavaType=ruleSmallJavaType();

            state._fsp--;

             current =iv_ruleSmallJavaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJavaType1265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJavaType"


    // $ANTLR start "ruleSmallJavaType"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:569:1: ruleSmallJavaType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSmallJavaType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:572:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:573:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:573:1: ( (otherlv_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:574:1: (otherlv_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:574:1: (otherlv_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:575:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJavaType1309); 

            		newLeafNode(otherlv_0, grammarAccess.getSmallJavaTypeAccess().getTypeSmallJavaCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJavaType"


    // $ANTLR start "ruleVisibilityTypes"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:594:1: ruleVisibilityTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) ;
    public final Enumerator ruleVisibilityTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:596:28: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:597:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:597:1: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:597:2: (enumLiteral_0= 'public' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:597:2: (enumLiteral_0= 'public' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:597:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_26_in_ruleVisibilityTypes1358); 

                            current = grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityTypesAccess().getPUBLICEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:603:6: (enumLiteral_1= 'private' )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:603:6: (enumLiteral_1= 'private' )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:603:8: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_27_in_ruleVisibilityTypes1375); 

                            current = grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityTypesAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleNamespace122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNamespace143 = new BitSet(new long[]{0x000000000C019000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleNamespace164 = new BitSet(new long[]{0x000000000C019000L});
    public static final BitSet FOLLOW_ruleSmallJava_in_ruleNamespace186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCards_in_ruleImport290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName378 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName412 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCards_in_entryRuleQualifiedNameWithWildCards460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCards471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCards518 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedNameWithWildCards537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibilityTypes_in_ruleSmallJava635 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleSmallJava654 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSmallJava680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava697 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSmallJava715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava735 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSmallJava749 = new BitSet(new long[]{0x0000000003E80010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSmallJava770 = new BitSet(new long[]{0x0000000003E80010L});
    public static final BitSet FOLLOW_19_in_ruleSmallJava783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleAttribute875 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleAttribute893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleDatatype1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_ruleDatatype1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType1090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSimpleType1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSimpleType1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSimpleType1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSimpleType1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSimpleType1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmallJavaType_in_entryRuleSmallJavaType1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJavaType1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJavaType1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleVisibilityTypes1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleVisibilityTypes1375 = new BitSet(new long[]{0x0000000000000002L});

}