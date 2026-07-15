object Config {
    val SUPABASE_URL = System.getenv("SUPABASE_URL") ?: ""
    val SUPABASE_ANON_KEY = System.getenv("SUPABASE_ANON_KEY") ?: ""
    val SUPABASE_SERVICE_ROLE_KEY = System.getenv("SUPABASE_SERVICE_ROLE_KEY") ?: ""
    val ELEVENLABS_API_KEY = System.getenv("ELEVENLABS_API_KEY") ?: ""
}

